import profilePic from './assets/yellowBgPfp.png'

function Card() {
  return (
    <div className="card">
      <img className="card-image" src={profilePic} alt="profile picture"></img>
      <h2 className="card-title" >Soham Ambore</h2>
      <p className="card-text">
        I'm a computer science student and i live in Bangalore and study WebDev
        and DSA
      </p>
    </div>
  );
}

export default Card;
