package br.com.studenton.adapter

import android.icu.text.SimpleDateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import br.com.studenton.R
import br.com.studenton.domain.Publicacao
import java.time.LocalDateTime

class AdapterPerguntasResponse(
    private val perguntas: List<Publicacao>) : RecyclerView.Adapter<AdapterPerguntasResponse.PerguntaHolder>(){

        inner class PerguntaHolder(
            private val itemView: View ) : RecyclerView.ViewHolder(itemView) {

                val titulo = itemView.findViewById<TextView>(R.id.txt_titulo_pergunta)
                val descricao = itemView.findViewById<TextView>(R.id.txt_desc_pergunta)
                val date_pg = itemView.findViewById<TextView>(R.id.txt_date_pergunta)
               // val status = itemView.findViewById<Int>(R.id.status)


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerguntaHolder {
            val layoutDoCard = LayoutInflater.from(parent.context).inflate(R.layout.fragment_pergunta_simple_item, parent, false)
            return PerguntaHolder(layoutDoCard)
        }

        override fun onBindViewHolder(holder: PerguntaHolder, position: Int) {

            var formatDataa = perguntas[position].dataHora
            var teste = LocalDateTime
            println(teste)
            holder.titulo.text = perguntas[position].titulo
            holder.descricao.text = perguntas[position].texto
            holder.date_pg.text = perguntas[position].dataHora
         //   holder.status.text = perguntas[position].tipoPublicacao




        }

        override fun getItemCount(): Int {
            return perguntas.size
        }
}