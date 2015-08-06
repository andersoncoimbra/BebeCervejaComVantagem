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
        TextView precoCErveja;
        TextView teorCerveja;
       final TextView resultado;
        Button calcular;

        mlCerveja = (TextView) findViewById(R.id.mlCerveja);
        calcular = (Button) findViewById(R.id.calcular);
        resultado = (TextView) findViewById(R.id.resultado);



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final Integer op = new Integer(mlCerveja.getText().toString());

                    switch (op){
                        case 1:
                        case 2:
                        case 3:
                            resultado.setText("Tudo ok" + mlCerveja.getText());
                            break;
                        default:
                            resultado.setText("Tudo errado" + mlCerveja.getText());

                    }
                }catch (Exception e){
                    resultado.setText("Tudo errado mesmo");
                }



            }
        });
    }




}
