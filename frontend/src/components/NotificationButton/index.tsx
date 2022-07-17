import axios from 'axios';
import img from '../../assets/img/Vector.svg';
import { BASE_URL } from '../../utils/request';
import './styled.css';

type Props ={
    saleId: number;
}

function handleClick(id :number) {
    axios(`${BASE_URL}/sales/${id}/notification`)
        .then(response => {
            console.log("Sucess");
        }); 
}

function NotificationButton( {saleId} : Props) {
    return(
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={img} alt="Notificar" />
        </div>
    )
  }
  
  export default NotificationButton;
  