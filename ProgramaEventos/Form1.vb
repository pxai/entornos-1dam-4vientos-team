Public Class Form1
    Public WithEvents mPersona1 As cPersona
    Public mPersona2 As cPersona

    Private Sub mPersona1_LimiteSueldo(ByVal sender As cPersona, ByVal e As System.EventArgs) Handles mPersona1.LimiteSueldo
        MessageBox.Show("No puedes poner ese sueldo menor de 1000 a " & sender.nombre)
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
End Class
