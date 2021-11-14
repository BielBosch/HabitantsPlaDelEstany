package cat.dam.biel.habitantspladelestany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    String[] municipis = new String[]{
            "Crespià", "Banyoles", "Camós", "Cornellà del Terri", "Esponellà",
            "Fontcoberta", "Palol de Revardit", "Porqueres", "Sant Miquel de Campmajor", "Serinyà", "Vilademuls"};

    int[] nHabitants = new int[]{
            254, 20053, 677, 2399, 463, 1469, 448, 4677, 229, 1133, 835};

    protected void onCreate(Bundle savedInstanceState) {
        //mostrar municipis
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, municipis);
        AutoCompleteTextView atv_municipis = (AutoCompleteTextView)
                findViewById(R.id.idText6);
        atv_municipis.setAdapter(adapter);

        //mostrar nHabitants

        final Button btn_1 = findViewById(R.id.idButton);
        final TextView tv_1 = findViewById(R.id.idText7);

        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Aquest és el codi que s'executa al clicar
                tv_1.setText("Has fet clic!");

                if (R.id.idText6 > 2) {
                    //mirar AIXO
                }
            }
        });


    }
}
