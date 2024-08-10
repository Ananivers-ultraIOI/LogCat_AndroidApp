package be.heh.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
// Méthode appelée à la création de l’activité (une seule fois)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Mon projet","  méthode OnCreate");
    }
    @Override
    protected void onStart(){
// Méthode appelée quand l’activité devient visible
        super.onStart();
        Log.i("Mon projet","  méthode OnStart");
    }
    @Override
    protected void onRestart(){
// Méthode appelée quand l’activité a été arrêtée et redémarrée
        super.onRestart();
        Log.i("Mon projet","  méthode onRestart");
    }
    @Override
    protected void onResume(){
//Méthode appelée lorsque l’activité a le focus (commence à interagir avec l’utilisateur)
        super.onResume();
        Log.i("Mon projet","  méthode onResume");
    }
    @Override
    protected void onPause(){
// Méthode appelée lorsque l’activité est mise en pause (perte du focus)
        super.onPause();
        Log.i("Mon projet","  méthode OnPause");
    }
    @Override
    protected void onDestroy(){
// Méthode appelée lorsque l’activité est détruite (une seule fois)  Libère la mémoire
        super.onDestroy();
        Log.i("Mon projet","  méthode onDestroy");
    }
    @Override
    protected void onStop(){
// Méthode appelée quand l’activité n’est plus visible
        super.onStop();
        Log.i("Mon projet","  méthode onStop");
    }
}