import { Component, OnInit } from '@angular/core';
import { movie } from './mock-movie';
@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss']
})
export class MoviesComponent implements OnInit {
  mv= movie;
  constructor() { }

  ngOnInit(): void {
  }

}
