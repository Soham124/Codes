import React from 'react'
import "./Card.css"

function Card(props) {
  return (
    <div className="card">
    <div className="card-title">{props.title}</div>
    <div className="card-description">{props.description}</div>
  </div>
  )
}

export default Card