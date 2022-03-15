import { Link } from 'react-router-dom';
import './Section.css';
import Cards from './Section_Card/Cards';
import Cards2 from './Section_Card/Cards2';
import Card1 from './Section_Card/Card1';
import FB from './Section_Card/CardFee/CardFb/FB';
import Pag from './Pagamento/Pagamento';

export default function Section(){    
    return(
        <>     
    <section className="titulo">
        <h2>Destinos Nacionais</h2>
    </section>
    <section>
       <Cards/>
       <Cards/>
       <Cards/>
       <Cards/>
       <Link to="/Destino" className="btn2">Mais Destinos Nacionais</Link>
    </section>

    <hr/>

    <section className="titulo">
        <h2>Destinos Internacionais</h2>
    </section>
    <section>
    <Cards2/>
    <Cards2/>
    <Cards2/>
    <Cards2/>
       <Link to="/Destino"> <button className="btn2">Mais Destinos Internacionais</button></Link>
    </section>

    <hr/>

    <section className="titulo">
        <h2>Promoções</h2>
    </section>
    <section>
        <Card1/>
        <Card1/>
        <Card1/>
        <Card1/>
       <Link to="/Promocoes" className="btn2"> Mais Promoções</Link>
    </section>

    <hr/>

    <section className="titulo">
            <h3>Depoimentos</h3>
            <h1>O que nossos usuários dizem!</h1>
            <p className="p">Lorem ipsum dolor sit amet consectetur adipisicing elit. Amet qui error at odio quisquam, alias quidem
                totam est voluptatibus aliquid porro fugit hic repellat nam modi optio tempora aspernatur officiis.</p>
        </section>
    <section>       
        <section>
        <FB/>
        <FB/>
        <FB/>
        <FB/>
        </section>        
        <section>
            <Link to = "/Contato" className="btn2">Clique aqui nos de seu Feedback</Link>
        </section>
    </section>

    <hr/>
    <section className="titulo">
            <h2>Formas de pagamento</h2>
    </section>
        <section>
            <Pag />
        </section>



    </>
    );
}