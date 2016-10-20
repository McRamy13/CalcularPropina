package soul.contadorpropina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Variables de las distintas vistas
    private EditText txtCuenta,txtPropina,txtPorcentajePropina ,txtTotalCuenta, txtComensales, txtPVPComensales;
    private Button btnLimpiarCuenta, btnRedondearCuenta, btnLimpiarComensales, btnRedondearComensales;
    //constante para tener el valor por defecto de los campos de cuenta y propina
    private double CUENTA_DEFECTO = 0.00;
    private int PROPINA_DEFECTO = 3;
    private int COMENSALES_DEFECTO = 1;
    //variables para propina y totales
    private double cuenta;
    private int propina;
    private int comensales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initvistas();
    }
    //inicializamos las vistas
    private void initvistas() {
        //Inicializamos las vistas.
        txtCuenta = (EditText) findViewById(R.id.txtCuenta);
        txtPropina = (EditText) findViewById(R.id.txtPropina);
        txtPorcentajePropina = (EditText) findViewById(R.id.txtPorcPropina);
        txtTotalCuenta = (EditText) findViewById(R.id.txtTotal);
        txtComensales = (EditText) findViewById(R.id.txtComensales);
        txtPVPComensales = (EditText) findViewById(R.id.txtPvPPorComensal);
        btnLimpiarCuenta = (Button) findViewById(R.id.btnLimpiarTotal);
        btnLimpiarComensales = (Button) findViewById(R.id.btnLimpiarComensales);
        btnRedondearCuenta = (Button) findViewById(R.id.btnRedondearTotal);
        btnRedondearComensales = (Button) findViewById(R.id.btnRedondearComensales);

    }
    //Si escribes un total, entonces se rellenan los otros campos.

    private void rellenarCampos (){
        txtCuenta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //Después de cambiar el texto, entonces cambiamos los otros textos
                calcularPropina();
            }
        });
    }
    //función para sacar el porcentaje del total y rellenar los campos.
    private void calcularPropina(){
        //para comenzar, calculamos el porcentaje del total, para ello, traemos lo que haya
        double calculoPorcentaje = Double.parseDouble(txtCuenta.getText().toString());
        int porcentajePropina = Integer.parseInt(txtPorcentajePropina.getText().toString());


    }
}
