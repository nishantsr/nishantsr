import { Component, OnInit } from '@angular/core';
import { chore, tchore, tmchore } from './mock-chores';
@Component({
  selector: 'app-chores',
  templateUrl: './chores.component.html',
  styleUrls: ['./chores.component.scss']
})
export class ChoresComponent implements OnInit {
  ch= chore;
  ch1= tchore;
  ch2= tmchore;
  constructor() { }

  ngOnInit(): void {
  }

}
