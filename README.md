<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->


<!-- PROJECT LOGO -->
<br />
<div align="center">
 
  <h3 align="center">Linked Cells Data Structure</h3>

  <p align="center">
    A data structure that creates an abstraction when using a 2d array in other words, you can use multiple directions to move in the array.
  </p>
</div>



<!-- HOW TO -->
## How to

This is an example of how you to use the data structure.

### Steps

You could follow the example in src/Main.java or you could do the following : 

1. Create your 2d array as an Object data type.

 ```sh
  Object arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
  ```

2. Create an instance of "LinkedCells" class and give it the 2d array.

 ```sh
 LinkedCells l = new LinkedCells(arr);

  ```


3. Create a 2d array of type "Node" and call "getInstance()" from the "LinkedCells" class.

 ```sh
 Node n[][] = l.getInstance();

  ```

4. You can now navigate through the array by using the ```sh n[row][col].direction ``` (direction is the pointer) if you want the actual data use ".data" after the direction :
  * the available directions are :
    - left.
    - right.
    - top.
    - bottom.
    - diagonalTopLeft.
    - diagonalBottomRight.
    - diagonalTopRight.
    - diagonalBottomLeft. 
 * Examples : 
  - ```sh n[0][0].right.bottom.data ``` // the right then bottom of the first element in the array.
  - ```sh n[1][0].right.right.data ``` // the right then right of the 2nd row, 1st col element in the array.



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the GPL License. See `LICENSE` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Mohamed Darag - mohameddarag96@gmail.com

Project Link: [https://github.com/DaragRepo/LinkedCells/](https://github.com/DaragRepo/LinkedCells)

<p align="right">(<a href="#top">back to top</a>)</p>
