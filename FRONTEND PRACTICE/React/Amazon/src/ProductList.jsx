import Product from "./Product"

export default function ProductList() {


    let styles = {
        display: "flex",
        flexDirection: "row",
        alignItems: "center",
        gap: "20px",
    }

    return(
        < div style={styles}>
        <Product name="iPhone 14 Pro" price={999} idx = {0}/>
        <Product name="Samsung Galaxy S23" price={799} idx = {1}/>
        <Product name="Google Pixel 7" price={599} idx = {2} />
        <Product name="OnePlus 11" price={699} idx = {3}/>
        </div>
    )
};