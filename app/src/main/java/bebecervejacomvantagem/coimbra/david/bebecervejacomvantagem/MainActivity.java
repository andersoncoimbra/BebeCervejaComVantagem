package bebecervejacomvantagem.coimbra.david.bebecervejacomvantagem;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView mlCerveja;
        final TextView precoCErveja;
        final TextView teorCerveja;
       final TextView resultado;
        Button calcular;

        mlCerveja = (TextView) findViewById(R.id.mlCerveja);
        precoCErveja = (TextView) findViewById(R.id.precoCerveja);
        teorCerveja = (TextView) findViewById(R.id.teorCerveja);
        calcular = (Button) findViewById(R.id.calcular);
        resultado = (TextView) findViewById(R.id.resultado);



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Integer op = new Integer(mlCerveja.getText().toString());
                    Double pr = new Double(precoCErveja.getText().toString());
                    Integer teor = new Integer(teorCerveja.getText().toString());
                    double result;

                    switch (op){
                        case 1:
                            result = ((350 *teor)/pr);
                            if(result >=350) {
                                resultado.setText("1 - beba com moderacao " + result);
                            }else{
                                resultado.setText("Nao beba procure outro bar " + result);
                            }

                        case 2:
                            result = ((600 *teor)/pr);
                            if(result >=300) {
                                resultado.setText("2 - beba com moderamoderacao " + result);
                            }else{
                                resultado.setText("Nao beba procure outro bar " + result);
                            }
                            break;
                        case 3:
                            result = ((1000 *teor)/pr);
                            if(result >=334) {
                                resultado.setText("2 - beba com moderacao " + result);
                            }else{
                                resultado.setText("Nao beba procure outro bar " + result);
                            }
                            break;
                        default:
                            resultado.setText("Escolha um opção de cerveja Valida" );

                    }
                }catch (Exception e){
                    resultado.setText("Algo deu errado... Tente novamente");
                }



            }
        });
    }




}
