import { useState } from "react";

function Likebtn() {

    let [isLiked, setIsLiked] = useState(false);

    let toggleLiked = () => {
        
        setIsLiked(!isLiked)
        
        }

        let styles = {color : "red"}

    return(
        <p onClick={toggleLiked}>
            {
            isLiked ? <i className="fa-solid fa-heart" style={styles}></i> :
             <i className="fa-regular fa-heart"></i>

            }
        </p>
    )
}

export default Likebtn