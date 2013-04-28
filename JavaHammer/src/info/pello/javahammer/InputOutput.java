package info.pello.javahammer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;



/**
 * Class to deal with console I/O
 * @author Float + greetz to pello, Benjamín ,  Pablo
 *
 */
public class InputOutput {
        
        private BufferedReader lector =new BufferedReader(new InputStreamReader(System.in));
        
        /**
         * InputOutput
         * default constructor
         */
        public InputOutput () {
                
        }
        
        /**
         * msg
         * displays msg
         */
        public void msg(String msg) {
                System.out.println(msg);
        }
        
        /**
         * readInt 
         * @param msg to show
         * @return readed value
         */
        public int readInt (String msg) {
                int result = 0;
                boolean noCorrectData = true;
                String readedLine = "";
                do {
                        try {
                                System.out.println(msg);
                                readedLine = lector.readLine(); 
                                result = Integer.parseInt(readedLine);
                                noCorrectData = false;
                        } catch (Exception e) {
                                System.err.println("Incorrect number format");
                                noCorrectData = true;
                        }
                        
                } while(noCorrectData);
                
                return result;
        }
        
        /**
         * readIntBounds
         * reads an integer within bounds
         * @param msg to show
         * @return readed value
         */
        public int readIntBounds (String msg, int min, int max) {
                int result = 0;
                boolean noCorrectData = true;
                String readedLine = "";
                do {
                        try {
                                System.out.println(msg);
                                readedLine = lector.readLine(); 
                                result = Integer.parseInt(readedLine);
                                if (result >= min && result <= max) { noCorrectData = false; }
                                else { System.out.println("Must be between " + min + " and " + max);}
                        } catch (Exception e) {
                                System.err.println("Incorrect number format");
                                noCorrectData = true;
                        }
                        
                } while(noCorrectData);
                
                return result;
        }
        
        /**
         * readMenuBounds
         * reads an integer within menu optionsw
         * @param msg to show
         * @param
         * @return readed value
         */
        public String readMenuBounds (String msg, Vector<GameMenuOption> options) {
                String result = "";
                boolean noCorrectData = true;
                int i = 0;
                do {
                        try {
                                System.out.println(msg);
                                result = lector.readLine(); 
                                for (i =0;i< options.size();i++) {
                                        if (options.get(i).getCode().equals(result)) {
                                                noCorrectData = false;
                                                break;
                                        }
                                }
                                //if (result >= min && result <= max) { noCorrectData = false; }
                                if (i == options.size()) { System.out.println("Option not allowed ");}
                        } catch (Exception e) {
                                System.err.println("Incorrect number format");
                                noCorrectData = true;
                        }
                        
                } while(noCorrectData);
                
                return result;
        }
        
        /**
         * readDecimal 
         * @param msg to show
         * @return readed value
         */
        public float readDecimal (String msg) {
                float result = 0;
                boolean noCorrectData = true;
                String readedLine = "";
                do {
                        try {
                                System.out.println(msg);
                                readedLine = lector.readLine(); 
                                result = Float.parseFloat(readedLine);
                                noCorrectData = false;
                        } catch (Exception e) {
                                System.err.println("Incorrect number format");
                                noCorrectData = true;
                        }
                        
                } while(noCorrectData);
                
                return result;
        }
        
        /**
         * read
         * @param mensaje
         * @return String
         */
        public String read (String msg) {
                String lineaLeida = "";
                
                try {
                        System.out.println(msg);
                        lineaLeida = lector.readLine(); 
                        
                } catch (Exception e) {
                        System.err.println("Error reading data, return 0");
                }
                
                return lineaLeida;
        }
        
        /**
         * readDate
         * @param mensaje
         * @return Date
         */
        public Date readDate (String msg) {
                String lineaLeida = "";
                Date fecha = new Date();
                SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
                
                try {
                        System.out.println(msg);
                        lineaLeida = lector.readLine(); 
                        fecha = formatoDeFecha.parse(lineaLeida);
                        
                } catch (Exception e) {
                        System.err.println("Error reading data, return 0");
                }
                
                return fecha;
        }
        

        /**
         * showList
         * @param list
         * @return
         */
        public String showList (Vector<String> list) {
                String result = "";
                for (int i = 0;i<list.size();i++)
                        result += list.get(i) + "\n";
                
                return result;
        }
        

        /**
         * menu
         * shows a menu for users
         * @param options
         * @param menuMsg
         * @return
         */
        public String menu(Vector<GameMenuOption> options, String menuMsg) {
                String option = "";
                msg(menuMsg);
                
                for (int i = 0;i< options.size();i++) {
                        msg(options.get(i).getCode() +". "+options.get(i).getName());
                }
                
                option = readMenuBounds("Option: ",options);
                
                return option;
                
        }
        
        /**
         * marks one of the menu options as used
         * @param options
         * @param number
         */
        public void removeMenuOption (Vector<GameMenuOption> options, String code) {
                for (int i =0;i< options.size();i++) {
                        if (options.get(i).getCode().equals(code) && options.get(i).isJustOnce()) {
                                options.remove(i);
                                return;
                        }
                }
        }


}

