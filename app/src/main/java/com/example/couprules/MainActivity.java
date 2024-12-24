package com.example.couprules;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar a Toolbar
        setSupportActionBar(findViewById(R.id.toolbar));

        // Definir o título da Toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Coup"); // Altere o texto conforme necessário
        }

        // Inicializar com o fragmento do Capitão
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new CapacoupFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);  // Adicionando o menu hamburguer
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         if (item.getItemId() == R.id.action_capacoup) {  // Novo item para Capacoup
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new CapacoupFragment())
                    .commit();
            getSupportActionBar().setTitle("Coup");
            return true;
        } else if (item.getItemId() == R.id.action_resumodeturno) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new ResumoDeTurno())
                    .commit();
            getSupportActionBar().setTitle("Resumo de turno");
            return true;
        } else if (item.getItemId() == R.id.action_regrasdepersonagens) {  // Novo item para Regras de Personagens
             getSupportFragmentManager().beginTransaction()
                     .replace(R.id.fragmentContainer, new RegrasDePersonagensFragment())
                     .commit();
             getSupportActionBar().setTitle("Regras de Personagens");
             return true;
         } else if (item.getItemId() == R.id.action_regrasbufaoburocrata) {  // Novo item para Regras de Personagens
             getSupportFragmentManager().beginTransaction()
                     .replace(R.id.fragmentContainer, new RegrasDeBufaoBurocrataFragment())
                     .commit();
             getSupportActionBar().setTitle("Regras do Bufão e Burocrata");
             return true;
         }  else if (item.getItemId() == R.id.action_regrasburgesbenfeitor) {  // Novo item para Regras de Personagens
             getSupportFragmentManager().beginTransaction()
                     .replace(R.id.fragmentContainer, new RegrasDeBurgesBenfeitorFragment())
                     .commit();
             getSupportActionBar().setTitle("Regras do Burguês e Benfeitor");
             return true;
         } else if (item.getItemId() == R.id.action_assassino) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new AssassinoFragment())
                    .commit();
            getSupportActionBar().setTitle("Assassino");
            return true;
        } else if (item.getItemId() == R.id.action_benfeitor) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new BenfeitorFragment())
                    .commit();
            getSupportActionBar().setTitle("BenFeitor");
            return true;
        } else if (item.getItemId() == R.id.action_bufao) {  // Novo caso para Bufão
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new BufaoFragment())
                    .commit();
            getSupportActionBar().setTitle("Bufão");
            return true;
        } else if (item.getItemId() == R.id.action_burgues) {  // Novo item para Burguês
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new BurguesFragment())
                    .commit();
            getSupportActionBar().setTitle("Burguês");
            return true;
        } else if (item.getItemId() == R.id.action_burocrata) {  // Novo item para Burocrata
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new BurocrataFragment())
                    .commit();
            getSupportActionBar().setTitle("Burocrata");
            return true;
        } else if (item.getItemId() == R.id.action_capitao) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new CapitaoFragment())
                    .commit();
            getSupportActionBar().setTitle("Capitão");
            return true;
        } else if (item.getItemId() == R.id.action_condessa) {  // Novo item para Condessa
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new CondessaFragment())
                    .commit();
            getSupportActionBar().setTitle("Condessa");
            return true;
        } else if (item.getItemId() == R.id.action_duque) {  // Novo item para Duque
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new DuqueFragment())
                    .commit();
            getSupportActionBar().setTitle("Duque");
            return true;
        } else if (item.getItemId() == R.id.action_embaixador) {  // Novo item para Embaixador
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new EmbaixadorFragment())
                    .commit();
            getSupportActionBar().setTitle("Embaixador");
            return true;
        } else if (item.getItemId() == R.id.action_inquisidor) {  // Novo item para Inquisidor
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new InquisitorFragment())
                    .commit();
            getSupportActionBar().setTitle("Inquisidor");
            return true;
        } else if (item.getItemId() == R.id.action_a_inquisicao) {  // Novo item para Inquisidor
             getSupportFragmentManager().beginTransaction()
                     .replace(R.id.fragmentContainer, new RegrasDeInquisicaoFragment())
                     .commit();
             getSupportActionBar().setTitle("Regras Inquisição");
             return true;
         } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
