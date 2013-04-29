Public Class cPersona
    Private _nombre As String
    Private _sueldo As Double
    Public Event LimiteSueldo(ByVal sender As cPersona, ByVal e As System.EventArgs)
    Public Event SuperSueldo(ByVal sender As cPersona, ByVal e As System.EventArgs)

    Public Property nombre As String
        Get
            Return _nombre
        End Get
        Set(ByVal value As String)
            _nombre = value
        End Set
    End Property

    Public Property sueldo As Double
        Get
            Return _sueldo
        End Get
        Set(ByVal value As Double)
            If value <= 0 Then
                Throw New Exception("El sueldo debe ser mayor que 0")
            ElseIf value < 1000 Then
                Dim miE As New EventArgs
                RaiseEvent LimiteSueldo(Me, miE)
            ElseIf value > 10000 Then


            Else
                _sueldo = value
            End If
        End Set
    End Property

    ''' <summary>
    ''' constructor vacío
    ''' </summary>
    ''' <remarks></remarks>
    Public Sub cPersona()

    End Sub

End Class
