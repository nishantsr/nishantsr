import { Component, OnInit } from '@angular/core';
import { img } from './mock-images';
@Component({
  selector: 'app-random-images',
  templateUrl: './random-images.component.html',
  styleUrls: ['./random-images.component.scss']
})
export class RandomImagesComponent implements OnInit {
  figure= img;
  constructor() { }

  ngOnInit(): void {
  }

}
