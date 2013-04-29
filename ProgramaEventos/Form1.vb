Public Class Form1
    Public WithEvents mPersona1 As cPersona
    Public WithEvents Per As cPersona
    Public mPersona2 As cPersona

    Private Sub mPersona1_LimiteSueldo(ByVal sender As cPersona, ByVal e As System.EventArgs) Handles mPersona1.LimiteSueldo
        MessageBox.Show("No puedes poner ese sueldo menor de 1000 a " & sender.nombre)
    End Sub

    Private Sub Per_SuperSueldo(ByVal sender As cPersona, ByVal e As SuperSueldoEventArg)

        Dim resultado As DialogResult = MessageBox.Show("Atención vas a poner un sueldo superior a 5000! " & e.SueldoAIntroducir.ToString & " a " & sender.nombre, "¡Al loro!", MessageBoxButtons.YesNoCancel)

        If resultado = Windows.Forms.DialogResult.Yes Then
            e.Admitirlo = True
        End If

        'Versión abreviada, operador ternario
        'e.Admitirlo = MessageBox.Show("Atención vas a poner un sueldo superior a 5000! " & 'e.SueldoAIntroducir.ToString & " a " & sender.nombre, "¡Al loro!", MessageBoxButtons.YesNoCancel) = 'Windows.Forms.DialogResult.Yes

    End Sub


    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        mPersona1 = New cPersona
        mPersona2 = New cPersona

        mPersona1.nombre = txtNombre.Text
        mPersona1.sueldo = Double.Parse(txtSueldo.Text)
        ' Ojo, esto solo se puede hacer una vez
        AddHandler mPersona2.LimiteSueldo, AddressOf mPersona1_LimiteSueldo

        mPersona2.nombre = txtNombre.Text
        mPersona2.sueldo = Double.Parse(txtSueldo.Text)


    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        Dim per As New cPersona
        AddHandler per.SuperSueldo, AddressOf Per_SuperSueldo
        AddHandler per.LimiteSueldo, AddressOf mPersona1_LimiteSueldo

        'Ojo, en el constructor aunque usemos las propiedades
        'no se aplicarán los eventos porque la instancia toda
        Dim per2 As New cPersona("Alguien2", Double.Parse(txtSueldo.Text))
        AddHandler per.SuperSueldo, AddressOf Per_SuperSueldo
        AddHandler per.LimiteSueldo, AddressOf mPersona1_LimiteSueldo


    End Sub
End Class
