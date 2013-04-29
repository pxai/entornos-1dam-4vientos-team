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
            ElseIf value > 5000 Then
                '
                Dim miE As New SuperSueldoEventArg(value)
                miE.Admitirlo = False
                RaiseEvent SuperSueldo(Me, miE)
            Else
                _sueldo = value
            End If
        End Set
    End Property

    ''' <summary>
    ''' constructor vacío
    ''' </summary>
    ''' <remarks></remarks>
    Public Sub New()

    End Sub

    Public Sub New(ByVal nombre As String, ByVal nuevoSueldo As Double)
        Me.nombre = nombre
        Me.sueldo = nuevoSueldo
    End Sub


End Class
