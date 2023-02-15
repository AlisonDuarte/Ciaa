package br.com.etecia.cia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView idListaValores;

    //CRIAR A BASE DE DADOS PARA OS FILMES
    String titulo[] = {"Rafiting", "Polo", "Caiaque", "Surf", "Windsurf"};
    String descricao[] = {"Aqui é a descrição do esporte, onde temos que enrolar muito para saber o tamanho do espaço.",
            "Aqui é a descrição do esporte, onde temos que enrolar muito para saber o tamanho do espaço.",
            "A nova invenção de Van Helsing transforma Drac e os amigos em humanos, e Johnny em um monstro. Agora, Drac deve encontrar uma maneira de reverter o feitiço antes que a mudança se torne permanente.",
            "Os valentes pinguins Capitão, Kowalski, Rico e Recruta se unem a uma força de elite, chamada Vento do Norte, para impedir que o vilão Dr. Octavius Brine acabe com os pinguins do mundo todo.",
            "Na glamourosa cidade de Redshore, Buster Moon e a galera enfrentam seus medos, fazem novos amigos e superam seus limites em uma jornada para convencer o recluso astro Clay Calloway a subir aos palcos novamente."
    };
    String avaliacao[] = {"4.5", "4.0", "5.0", "2.0", "3.7"};
    int imagem[] = {R.drawable.rafiting, R.drawable.polo, R.drawable.caiaque, R.drawable.surf, R.drawable.windsurf};


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idListaValores = findViewById(R.id.idListaValores);
        MyAdapter adapter = new MyAdapter();
        idListaValores.setAdapter(adapter);
    }


    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return imagem.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView idImagem;
            TextView idtitulo, iddescricao, idavaliacao;

            //ADAPTADOR LIGANDO AO MODELO

            //View v = getLayoutInflater().inflate(R.layout.modelo_juntos, null);
            View v = getLayoutInflater().inflate(R.layout.modelo_juntos, null);

            //APRESENTANDO AS VARIAVEIS DO JAVA PARA O XML
            idImagem = v.findViewById(R.id.idimagem);
            idtitulo = v.findViewById(R.id.idtitulo);
            iddescricao = v.findViewById(R.id.iddescricao);
            idavaliacao = v.findViewById(R.id.idavaliacao);


            //inserindo valores nas variaveis
            idtitulo.setText(titulo[i]);
            iddescricao.setText(descricao[i]);
            idImagem.setImageResource(imagem[i]);
            idavaliacao.setText(avaliacao[i]);
            return v;
        }
    }

}