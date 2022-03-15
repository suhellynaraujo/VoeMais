import React from "react";
import { Link } from "react-router-dom";
import "./Nav.css";
import Logo from "../../assets/img/Logo3.png";

export default function Nav() {
  return (
  
        <nav class="navbar navbar-expand-lg  menu ">
          <div class="container-fluid menu">
            <Link to="/">
              <img src={Logo} alt="Logo" className="logo" />
            </Link>
            <button
              class="navbar-toggler navbar-dark"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNavAltMarkup"
              aria-controls="navbarNavAltMarkup"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span class="navbar-toggler-icon"></span>
            </button>
            <div
              class="collapse navbar-collapse justify-content-end"
              id="navbarNavAltMarkup"
            >
              <div class="navbar-nav navbaixa">
                <Link to="/">
                  <a className="nav-link">Início</a>
                </Link>
                <Link to="/Destino">
                  <a className="nav-link">Destino</a>
                </Link>
                <Link to="/Promocoes">
                  <a className="nav-link">Promoções</a>
                </Link>
                <Link to="/Contato">
                  <a className="nav-link">Contato</a>
                </Link>
                <Link to="/Login">
                  <a className="nav-link">Login</a>
                </Link>
              </div>
            </div>
          </div>
        </nav>
      
  );
}
