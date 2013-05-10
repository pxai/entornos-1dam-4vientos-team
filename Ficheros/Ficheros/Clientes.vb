Imports System.IO 'Asi no hace falta poner IO 
Public Class Clientes
    Private _lstClientes As New List(Of Cliente)
    Public ReadOnly Property LstClientes As ObjectModel.ReadOnlyCollection(Of Cliente)
        Get
            Return _lstClientes.AsReadOnly
        End Get
    End Property

    Public Sub New()
        Dim fich As IO.StreamReader
        'Se puede preguntar si exixte con la siguiente instruccion 
        'If Not IO.File.Exists("Perros.txt") Then Exit Sub
        Try
            fich = New IO.StreamReader("Clientes.txt")
            'fich.EndOfStream ' Si ha llegado a fin de  fichero
            Do While Not fich.EndOfStream
                Dim miCliente As New Cliente
                miCliente.Servidor = fich.ReadLine()
                miCliente.Usuario = fich.ReadLine()
                miCliente.Contraseña = fich.ReadLine()
                miCliente.Puerto = fich.ReadLine()
                _lstClientes.Add(miCliente)
            Loop
            fich.Close()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub
    Public Overloads Function Añadir(ByVal servidor As String, ByVal usuario As String, ByVal contraseña As String, ByVal puerto As Integer) As Cliente
        Dim cliente As New Cliente
        cliente.Servidor = servidor
        cliente.Usuario = usuario
        cliente.Contraseña = contraseña
        cliente.Puerto = puerto
        If _lstClientes.Contains(cliente) Then Return Nothing
        _lstClientes.Add(cliente)
        Return cliente
    End Function
    Public Overloads Function Añadir(ByVal cliente As Cliente) As Cliente
        If _lstClientes.Contains(cliente) Then Return Nothing
        _lstClientes.Add(cliente)
        'Se puede guardar (solo este CLIENTE) abriendo el fichero con el 2º parametro 
        'de append a cierto (boolean)
        'Dim fich As New IO.StreamWriter("Clientes.txt", True)
        'fich.WriteLine(cliente.Servidor)
        'fich.WriteLine(cliente.Usuario)
        'fich.WriteLine(cliente.Contraseña)
        'fich.WriteLine(cliente.Puerto)
        'fich.Close()
        Return cliente
    End Function
    Public Function Borrar(ByVal cliente As Cliente) As String
        'El Contains y el Remove funciona porque sobrecarga el Equals
        If Not _lstClientes.Contains(cliente) Then
            Return "Cliente inexistente"
        End If
        _lstClientes.Remove(cliente)
        Return "Cliente borrado"
    End Function
    Public Sub GuardarCliente()
        Dim fich As New IO.StreamWriter("Clientes.txt") 'Crea  el fichero nuevo
        For Each MiCliente As Cliente In _lstClientes
            fich.WriteLine(MiCliente.Servidor)
            fich.WriteLine(MiCliente.Usuario)
            fich.WriteLine(MiCliente.Contraseña)
            fich.WriteLine(MiCliente.Puerto)
        Next
        fich.Close()
    End Sub

End Class
