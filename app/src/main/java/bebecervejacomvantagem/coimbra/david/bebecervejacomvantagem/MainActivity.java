package bebecervejacomvantagem.coimbra.david.bebecervejacomvantagem;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mlCerveja;
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
                resultado.setText("Tudo ok");


            }
        });
    }



}
