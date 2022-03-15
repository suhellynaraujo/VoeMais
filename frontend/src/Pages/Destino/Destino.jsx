import Nav from "../../Components/Nav/Nav";
import Footer from "../../Components/Footer/Footer";
import CardN  from "../../Components/Main/Section/Section_Card/CardN/CardN";
import '../../Components/Main/Section/Section.css';
import './Destino.css'
import Pag from "../../Components/Main/Section/Pagamento/Pagamento";
import FomularioDestino from "../../Components/Main/Fomuario/FormularioDestino";





export default function Destino(){
    return( 

        <>
        <Nav></Nav>                
        <section class="titulo">
            <h2>Destinos Nacionais e Internacionais</h2>
        </section>

        <section >
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>
        <CardN/>

        
        </section>
        <hr/>
        <FomularioDestino></FomularioDestino>
        <hr/>
        <section className="titulo">
            <h2>Formas de pagamento</h2>
        </section>
        <section>
            <Pag/>
        </section>
      
        <Footer></Footer>

        </>
    );
}