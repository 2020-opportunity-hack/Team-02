import styled from "styled-components";
import { colorObj } from './GlobalStyles';

export const PageBody = styled.div`
${'' /* position: absolute; */}
height: 100%;
width: 100%;
left: 0px;
border-radius: 0px;
display: flex;
justify-content: center;
flex-direction: column;
`;

export const Card = styled.div`
margin: 2% 20%;
padding: 3%;
border-radius: 10px;
${'' /* position: absolute; */}
box-shadow: 0px 4px 20px 0px ${colorObj.dark};
`;

