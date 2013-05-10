Public Class Form1
    Private misClientes As Clientes

    Private Sub btnListar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnListar.Click
        misClientes = New Clientes
        lstClientes.DataSource = misClientes.LstClientes 'Si no hay DisplayMember muestra por ToString
        'lstPerros.DisplayMember = "Nombre" 'Campo a mostrar
    End Sub

    Private Sub btnAñadir_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAñadir.Click
        Dim miCliente As New Cliente

        miCliente.Servidor = txtNombre.Text
        miCliente.Usuario = txtUsuario.Text
        miCliente.Contraseña = txtContraseña.Text
        If Not IsNumeric(txtPuerto.Text) Then
            MessageBox.Show("Introduce un número")
            txtPuerto.Focus()
        Else
            miCliente.Puerto = txtPuerto.Text
            'misClientes = New Clientes
            misClientes.Añadir(miCliente)
        End If
        'Si no funciona solo con DataSource, agregamos la siguiente linea
        'Para que se disvincule
        lstClientes.DataSource = Nothing
        lstClientes.DataSource = misClientes.LstClientes
        If misClientes.Añadir(miCliente) Is Nothing Then
            MessageBox.Show("Cliente ya existe")

        End If
    End Sub

    Private Sub btnBorrar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnBorrar.Click
        Dim re As String
        Dim miCliente As New Cliente
        miCliente.Servidor = txtNombre.Text
        miCliente.Usuario = txtUsuario.Text
        miCliente.Contraseña = txtContraseña.Text
        miCliente.Puerto = txtPuerto.Text
        re = misClientes.Borrar(miCliente)
        lstClientes.Items.Remove(miCliente)
        If re.Contains("inexistente") Then
            MessageBox.Show("Cliente no existe")
        Else
            MessageBox.Show("Dale a guardar para q se guarden los cambios")
        End If
    End Sub

    Private Sub btnGuardar_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnGuardar.Click
        misClientes.GuardarCliente()
    End Sub

End Class
