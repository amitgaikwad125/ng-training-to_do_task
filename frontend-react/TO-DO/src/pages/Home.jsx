import React, { useEffect, useState } from 'react'
import axios from "axios";


function Home() {

    const [data , setData] = useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/todo/getAll").then((data)=>{
            setData(data.data);
    })
    },[])
   
    console.log(data);
    
  return (
    <div>
      <h1>All Tasks</h1>

      <table border="1px">
            <thead>
                <tr>
                    <th>AssignedTo</th>
                    <th>status</th>
                    <th>Due date</th>
                    <th>Priority</th>
                    <th>Comments</th>
                </tr>
            </thead>
            <tbody>
            {
        data.map((e)=>{
                return <tr>
 
                        <td>{e.user}</td>
                        <td>{e.status}</td>
                        <td>{e.date}</td>  
                        <td>{e.priority}</td>  
                        <td>{e.comment}</td>

               
                </tr>
               
        })
      } 
            </tbody>
      </table >
      
    </div>
  )
}

export default Home
