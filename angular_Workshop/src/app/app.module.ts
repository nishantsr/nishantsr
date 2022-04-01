import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MockComponent } from './component/mock/mock.component';
import { MoviesComponent } from './component/movies/movies.component';
import { HeaderComponent } from './component/header/header.component';
import { RandomImagesComponent } from './component/random-images/random-images.component';
import { ChoresComponent } from './component/chores/chores.component';
import { FooterComponent } from './component/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    MockComponent,
    MoviesComponent,
    HeaderComponent,
    RandomImagesComponent,
    ChoresComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
