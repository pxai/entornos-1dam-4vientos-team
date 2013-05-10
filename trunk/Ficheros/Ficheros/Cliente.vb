Public Class Cliente : Implements IEquatable(Of Cliente)
    Public Property Servidor As String
    Public Property Usuario As String
    Public Property Contraseña As String
    Public Property Puerto As Integer

    
    Public Overrides Function ToString() As String
        Return Usuario & "@" & Servidor
    End Function
    Public Overloads Function Equals(ByVal other As Cliente) As Boolean Implements System.IEquatable(Of Cliente).Equals
        Return Equals(Me, other)
    End Function
    Public Overloads Shared Function Equals(ByVal cliente1 As Cliente, ByVal cliente2 As Cliente) As Boolean
        Return cliente1.Servidor = cliente2.Servidor And cliente1.Usuario = cliente2.Usuario
    End Function
End Class
