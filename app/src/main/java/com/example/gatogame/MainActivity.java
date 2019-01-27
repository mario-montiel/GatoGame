package com.example.gatogame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int turno = 0;
    String letra = "", now = "";
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.ganador);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.reiniciar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(turno>=2)
        {
            turno = 0;
        }
        switch (v.getId())
        {
            case R.id.btn1:
                Button btn1 = findViewById(R.id.btn1);
                turno++;
                if(turno == 1)
                {
                    btn1.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn1.setText("O");
                    letra = "O";
                }
                btn1.setEnabled(false);
                break;
            case R.id.btn2:
                Button btn2 = findViewById(R.id.btn2);
                turno++;
                if(turno == 1)
                {
                    btn2.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn2.setText("O");
                    letra = "O";
                }
                btn2.setEnabled(false);
                break;
            case R.id.btn3:
                Button btn3 = findViewById(R.id.btn3);
                turno++;
                if(turno == 1)
                {
                    btn3.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn3.setText("O");
                    letra = "O";
                }
                btn3.setEnabled(false);
                break;
            case R.id.btn4:
                Button btn4 = findViewById(R.id.btn4);
                turno++;
                if(turno == 1)
                {
                    btn4.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn4.setText("O");
                    letra = "O";
                }
                btn4.setEnabled(false);
                break;
            case R.id.btn5:
                Button btn5 = findViewById(R.id.btn5);
                turno++;
                if(turno == 1)
                {
                    btn5.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn5.setText("O");
                    letra = "O";
                }
                btn5.setEnabled(false);
                break;
            case R.id.btn6:
                Button btn6 = findViewById(R.id.btn6);
                turno++;
                if(turno == 1)
                {
                    btn6.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn6.setText("O");
                    letra = "O";
                }
                btn6.setEnabled(false);
                break;
            case R.id.btn7:
                Button btn7 = findViewById(R.id.btn7);
                turno++;
                if(turno == 1)
                {
                    btn7.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn7.setText("O");
                    letra = "O";
                }
                btn7.setEnabled(false);
                break;
            case R.id.btn8:
                Button btn8 = findViewById(R.id.btn8);
                turno++;
                if(turno == 1)
                {
                    btn8.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn8.setText("O");
                    letra = "O";
                }
                btn8.setEnabled(false);
                break;
            case R.id.btn9:
                Button btn9 = findViewById(R.id.btn9);
                turno++;
                if(turno == 1)
                {
                    btn9.setText("X");
                    letra = "X";
                }
                else if(turno == 2)
                {
                    btn9.setText("O");
                    letra = "O";
                }
                btn9.setEnabled(false);
                break;
            case R.id.reiniciar:
                Reiniciar(now);
                break;
        }
        Ganador(letra);
        //Toast.makeText(this, "letra"+letra, Toast.LENGTH_SHORT).show();
    }

    public void Ganador(String letra)
    {
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }
        else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            texto.setText("Ganó: Jugador 1");
        }

        if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
        texto.setText("Ganó: Jugador 2");
        }
        else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
        else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            texto.setText("Ganó: Jugador 2");
        }
    }

    public void Reiniciar(String now)
    {
        turno = 0;
        letra = "";
        texto.setText("");

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

    }

}
