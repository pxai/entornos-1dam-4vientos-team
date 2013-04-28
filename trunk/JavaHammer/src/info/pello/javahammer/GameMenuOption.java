package info.pello.javahammer;


/**
 * Represents one menu option, part of menu Vector
 * @author Float
 * 
 */
public class GameMenuOption {
        private String code;
        private String name;
        private boolean justOnce;
        
        /**
         * @param number
         * @param name
         * @param justOnce
         */
        public GameMenuOption(String code, String name, boolean justOnce) {
                this.code = code;
                this.name = name;
                this.justOnce = justOnce;
        }
        
        /**
         * @return the menu code
         */
        public String getCode() {
                return code;
        }
        
        /**
         * @return the name
         */
        public String getName() {
                return name;
        }
        
        /**
         * @return the justOnce
         */
        public boolean isJustOnce() {
                return justOnce;
        }
       
 }

