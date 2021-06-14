import { ProductDetails } from './product-details';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  [x: string]: any;

  constructor() { }
  imageRootPath :string = 'assets/productImages/'
  getAllProducts(): ProductDetails[]
  {
    let Mango : ProductDetails = {
      plantName: "mango",
      plantCost: 2000,
      rating: 4.5,
      description: "Hybrid Mango plant which yields sweet fruits",
      imageName:this.imageRootPath + '/mango.jpg'
    }
    let Apple : ProductDetails = {
      plantName: "apple",
      plantCost: 500,
      rating: 4,
      description: "Hybrid Apple plant which yields sweet fruits",
      imageName:this.imageRootPath + '/apple.jpg'
    }
    let Grapes : ProductDetails = {
      plantName: "grapes",
      plantCost: 400,
      rating: 3,
      description: "Hybrid Grape wine plant which yields sweet and sour fruits",
      imageName:this.imageRootPath + '/grapes.jpg'
    }
    return [Mango,Apple,Grapes];
    }

  }
