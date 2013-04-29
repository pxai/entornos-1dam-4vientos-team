Public Class SuperSueldoEventArg : Inherits EventArgs
    Public Property SueldoAIntroducir As Double
    Public Property Admitirlo As Boolean

    ''' <summary>
    ''' constructor vacío
    ''' </summary>
    ''' <remarks></remarks>
    Public Sub New()

    End Sub

    ''' <summary>
    ''' Constructor con parámetro
    ''' 
    ''' </summary>
    ''' <param name="sueldoAIntroducir"></param>
    ''' <remarks></remarks>
    Public Sub New(ByVal sueldoAIntroducir As Double)
        Me.SueldoAIntroducir = sueldoAIntroducir
    End Sub
End Class
