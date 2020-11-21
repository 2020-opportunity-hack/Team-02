import React from 'react';
import { PageBody, Card } from '../../Styles/PageStyle';
import Navbar from "../common/Navbar";
import Footer from "../common/Footer";

const Blog = () => {

    return(
        <div>
            <Navbar />
        <PageBody>
        <h1 style={{paddingTop: "12%"}}>Blogs</h1>
        <br/>
        <Card>
            <h2>Vidyodaya Children’s Expressions in the CONSTELLATION</h2>
            <img src="" alt=""/>
            <p>Expressions: Art from children expresses their world in their own perspectives and has never failed to amaze us.

            CONSTELLATION is a France based initiative: They work on the theme ‘Art to help the world’s children grow and connect in the world’. Their goal is to encourage the human, economic and cultural development of children and teens through artistic creation.

            In the recent edition of their gallery the expressions of our Vidyodaya children has been published.</p>
        </Card>
        <Card>
            <h2>Vidyodaya Children’s Expressions in the CONSTELLATION</h2>
            <img src="" alt=""/>
            <p>Expressions: Art from children expresses their world in their own perspectives and has never failed to amaze us.

            CONSTELLATION is a France based initiative: They work on the theme ‘Art to help the world’s children grow and connect in the world’. Their goal is to encourage the human, economic and cultural development of children and teens through artistic creation.

            In the recent edition of their gallery the expressions of our Vidyodaya children has been published.</p>
        </Card>
        </PageBody>
        </div>
    )
}
    
export default Blog;