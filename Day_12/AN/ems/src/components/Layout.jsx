import { Outlet , Link } from "react-router-dom";
import Header from "./Header";

const Layout = ()=>{

    return(
        <div className = "layout-container">
            <Header/>

            <main className = "main-content">
                <Outlet/>
            </main>

            {/* <Footer/> */}
        </div>
    );
};

export default Layout;