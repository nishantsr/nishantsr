import { Component, OnInit } from '@angular/core';
import { movie, watched } from './mock-movie';
import { Movie } from './movie';
@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.scss']
})
export class MoviesComponent implements OnInit {
  mv= movie;
  watch= watched;
  constructor() { }
  sayHello(movie: Movie)
  {
    if(this.watch.includes(movie)){
      alert("Already Watched");
    }else{
      this.watch.push(movie);
    }
  }
  remove(){
    this.watch.pop();
  }
  ngOnInit(): void {
  }

}
