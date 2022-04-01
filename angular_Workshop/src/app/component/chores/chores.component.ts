import { Component, OnInit } from '@angular/core';
import { chore } from './mock-chores';
@Component({
  selector: 'app-chores',
  templateUrl: './chores.component.html',
  styleUrls: ['./chores.component.scss']
})
export class ChoresComponent implements OnInit {
  ch= chore;
  constructor() { }

  ngOnInit(): void {
  }

}
