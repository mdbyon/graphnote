import React, { Component } from "react";
import * as d3 from "d3";
import fetch from "node-fetch";

class Canvas extends Component {
  constructor(props) {
    super(props);
    this.state = {
      books:[],
    }
  }

  componentDidMount() {
    this.fetchBooks();
    const data = [2, 4, 2, 6, 8];
    this.drawBarChart(data);
  }

   fetchBooks(){
     fetch("http://localhost:8080/books", {'headers': 'Access-Control-Allow-Origin: http://localhost'})
     .then(response => response.json())
     .then((response) =>{
      console.log(response)
      this.setState({books: response})
    })
  }

  drawBarChart(data) {
    const canvasHeight = 400;
    const canvasWidth = 600;
    const scale = 20;
    const svgCanvas = d3
      .select(this.refs.canvas)
      .append("svg")
      .attr("width", canvasWidth)
      .attr("height", canvasHeight)
      .style("border", "1px solid black");
    svgCanvas
      .selectAll("rect")
      .data(data)
      .enter()
      .append("rect")
      .attr("width", 40)
      .attr("height", datapoint => datapoint * scale)
      .attr("fill", "orange");
  }
  render() {
    return <div ref="canvas" />;
  }
}

export default Canvas;
