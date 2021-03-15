import React, {useState} from 'react'

const Counter = () => {
  const [count, setCount] = useState(0)

  const onClick = () => {setCount(count+1)}
  const downClick = () => {setCount(count-1)}
  return (
    <>
    <h1>{count}</h1>
    <button onClick= {onClick}>+</button>
    <button onClick= {downClick}>-</button>
    </>
  )
}

export default Counter;