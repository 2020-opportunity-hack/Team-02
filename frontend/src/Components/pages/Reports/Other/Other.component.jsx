import React from "react";
import { useHistory } from "react-router-dom";
// styled-components
import {
  Container,
  HeadingContainer,
  Heading,
  BackBtn,
} from "../Reports.styles";

import { ReportsContainer, Document, Name } from "./Other.styles";

const Other = (props) => {
  const history = useHistory();
  const { reports } = props;

  const goBack = () => {
    history.push("/reports/");
  };

  return (
    <Container>
      <HeadingContainer>
        <Heading>Other Reports</Heading>
        <BackBtn onClick={goBack}>Back</BackBtn>
      </HeadingContainer>
      <ReportsContainer>
        {reports.map((doc) => {
          return (
            <Document key={doc.reportId}>
              <Name to={`/reports/${doc.title}/${doc.reportId}`}>
                {doc.title}
              </Name>
            </Document>
          );
        })}
      </ReportsContainer>
    </Container>
  );
};

export default Other;
