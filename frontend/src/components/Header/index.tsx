import img from '../../assets/img/Headerimg.svg'
import './styled.css'

function Header() {
    return(
        <header>
        <div className="dsmeta-logo-container">
            <img src={img} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig</a>
            </p>
        </div>
    </header>
    )
  }
  
  export default Header;
  