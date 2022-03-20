import React from "react";
import { Link } from "react-router-dom";
import "./Header.css";
import "../../index.css";
import Logo2 from "../../assets/img/Logo2.svg";

export default function Header() {
  return (
    <>
      <header className="Header">
        <nav className="navbar navbar-expand-lg ">
          <div className="container-fluid men ">
            <Link to="/">
              <img src={Logo2} alt="Logo2" className="logo" />
            </Link>
            <button
              className="navbar-toggler navbar-dark"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNavAltMarkup"
              aria-controls="navbarNavAltMarkup"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon navbar-dark"></span>
            </button>
            <div
              className="collapse navbar-collapse justify-content-end"
              id="navbarNavAltMarkup"
            >
              <div className="navbar-nav navbaixa" >
                <Link to="/" className="nav-link ">
                  Início
                </Link>
                <Link to="/Destino" className="nav-link ">
                  Destino
                </Link>
                <Link to="/Promocoes" className="nav-link ">
                  Promoções
                </Link>
                <Link to="/Contato" className="nav-link ">
                 Contato
                </Link>
                <Link to="/Login" className="nav-link ">
                 Login
                </Link>
              </div>
            </div>
          </div>
        </nav>
        <div className="container">
          <div className="texto">
            <div className="textoH1">
              <h1>Cadastre-se para disfrutar de ofertas exclusivas!</h1>
            </div>
            <div className="textoP">
              <p className="p">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas
                eaque minus facilis, magnam quae explicabo ratione, commodi
                maiores consequuntur iusto molestias qui, voluptate nemo. Ipsa
                autem suscipit distinctio possimus expedita.
              </p>
            </div>
            <div>
              <Link to="/Cadastro" className="btn">               
                 Cadastre-se          
              </Link>
            </div>
          </div>
        </div>
      </header>
    </>
  );
}
