import "../ContatoMain/ContatoMain.css"

export default function FomularioContato(){
    return(
       <>
      <div class="divMensagem">
           <h5 class="titulos">Envie sua mensagem</h5>
        <div className="container">
          <form class="formMensagem">
          
          <input type="text" id="email" name="email" placeholder="E-mail" />
          
          <input type="text" id="nome" name="nome" placeholder="Nome" />
          
          <label htmlFor="mensagem"></label>
          <textarea id="mensagem" name="mensagem" placeholder="Mensagem" className="textArea"></textarea>
          
          <input type="submit"  class="btn" value="Enviar" />
          </form>
          </div>
      </div>
       </>
    );
}