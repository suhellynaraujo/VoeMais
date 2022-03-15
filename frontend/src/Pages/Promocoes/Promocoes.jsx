import Nav from "../../Components/Nav/Nav";
import './Promocoes.css'
import Footer from "../../Components/Footer/Footer";
import CardN from "../../Components/Main/Section/Section_Card/CardN/CardN";
import Pag from "../../Components/Main/Section/Pagamento/Pagamento";


export default function Promocoes(){
    return( 

        <>
        <header className="he">
        <Nav></Nav>

        </header>
        <section className="titulo">
        <h2>Aqui você encontra alguns de nossos pacotes de promoções!</h2>
        </section>
        <section>
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