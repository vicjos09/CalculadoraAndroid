package com.example.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends Activity {
    private Button boton0;

    private Button borrar;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;


    private Button botonSuma;
    private Button botonResta;
    private Button botonMulti;
    private Button botonDiv;
    private Button botonIgual;
    private TextView lblMensaje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String valorPrimario="1";
        Operacion operacion=new Operacion();
        operacion.setFlag(0);

        setup();
        boton0.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"0");
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"1");
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"2");
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"3");
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"4");
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"5");
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"6");
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"7");
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"8");
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Boton Presionado",valor);
                lblMensaje.setText(valor+"9");
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                String valor= (String) lblMensaje.getText();
                Log.v("Borrar",valor);
                lblMensaje.setText("");
            }
        });
        botonSuma.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                Integer valor;
                Integer SegundoValor=0;
                try{
                        valor = Integer.parseInt((String) lblMensaje.getText());
                        operacion.setPrimerValor(valor);
                        operacion.setFlag(1);
                        SegundoValor=(Integer)operacion.getFlag();

                        lblMensaje.setText("");
                }catch (NumberFormatException e){
                    valor=0;
                }
                Log.v("BotonSuma", valor.toString());
                Log.v("valor flag",SegundoValor.toString());
            }
        });
        botonResta.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                Integer valor;
                Integer SegundoValor;
                try{
                    valor = Integer.parseInt((String) lblMensaje.getText());
                    operacion.setPrimerValor(valor);
                    operacion.setFlag(2);
                    lblMensaje.setText("");
                }catch (NumberFormatException e){
                    valor=0;
                }
                Log.v("BotonSuma", valor.toString());
            }
        });
        botonMulti.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                Integer valor;
                Integer SegundoValor;
                try{
                    valor = Integer.parseInt((String) lblMensaje.getText());
                    operacion.setPrimerValor(valor);
                    operacion.setFlag(3);
                    lblMensaje.setText("");
                }catch (NumberFormatException e){
                    valor=0;
                }
                Log.v("BotonSuma", valor.toString());
            }
        });
        botonDiv.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                Integer valor;
                Integer SegundoValor;
                try{
                    valor = Integer.parseInt((String) lblMensaje.getText());
                    operacion.setPrimerValor(valor);
                    operacion.setFlag(4);
                    lblMensaje.setText("");
                }catch (NumberFormatException e){
                    valor=0;
                }
                Log.v("BotonSuma", valor.toString());
            }

        });
        botonIgual.setOnClickListener(new View.OnClickListener() { //se vincula un manejador de eventos al objeto Bot�n
            public void onClick(View arg0)
            {
                Integer valorSegundo;
                Integer resultado=0;
                Integer bandera=0;


                try{
                    valorSegundo = Integer.parseInt((String) lblMensaje.getText());
                    operacion.setSegundoValor(valorSegundo);
                    bandera=(Integer) operacion.getFlag();
                    Log.v("Bandera", bandera.toString() );
                    if(operacion.getFlag()==0) lblMensaje.setText("");
                    if(operacion.getFlag()==1){ resultado=operacion.suma();  lblMensaje.setText(resultado.toString()) ;  }
                    if(operacion.getFlag()==2){ resultado=operacion.resta();  lblMensaje.setText(resultado.toString()) ;  }
                    if(operacion.getFlag()==3){ resultado=operacion.multiplicacion();  lblMensaje.setText(resultado.toString()) ;  }
                    if(operacion.getFlag()==4){ resultado=operacion.division();  lblMensaje.setText(resultado.toString()) ;  }

                    operacion.setFlag(0);

                }catch (NumberFormatException e){
                    valorSegundo=0;
                }
                Log.v("BotonOperacion", valorSegundo.toString());
            }
        });



    }


    protected void setup(){
        lblMensaje = (TextView)findViewById(R.id.resultadoTextView);

        boton0=(Button)findViewById(R.id.ceroBoton);
        boton1=(Button)findViewById(R.id.unoBoton);
        boton2=(Button)findViewById(R.id.dosBoton);
        boton3=(Button)findViewById(R.id.tresBoton);
        boton4=(Button)findViewById(R.id.cuatroBoton);
        boton5=(Button)findViewById(R.id.cincoBoton);
        boton6=(Button)findViewById(R.id.seisBoton);
        boton7=(Button)findViewById(R.id.sieteBoton);
        boton8=(Button)findViewById(R.id.ochoBoton);
        boton9=(Button)findViewById(R.id.nueveboton);


        botonSuma=(Button)findViewById(R.id.sumaBoton);
        botonResta=(Button)findViewById(R.id.restaBoton);
        botonMulti=(Button)findViewById(R.id.multiBoton);
        botonDiv=(Button)findViewById(R.id.divisionBoton);
        borrar=(Button)findViewById(R.id.borrarBoton);
        botonIgual=(Button)findViewById(R.id.igualBoton);
    }
}