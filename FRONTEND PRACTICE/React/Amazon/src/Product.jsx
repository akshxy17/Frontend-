export default function Product({ name, price}) {
 
    let lest = ["Hey bro", "Hola" , "Hello", "Byes"];


    let styles = {
        border: "1px solid black",
        padding: "10px",
        borderRadius: "5px",
        width: "200px",
        textAlign: "center",
    }

    return (
        <div className="product" style={styles}>
            <h2>{name}</h2>
            <p>Price: ${price}</p>
            {/* <p>{lest}</p> */}
        
        </div>
    )
    }