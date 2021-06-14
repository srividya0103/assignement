import { StockComponent } from './../stock/stock.component';

import { DemoComponent } from './../demo/demo.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LinkcomponentComponent } from './linkcomponent/linkcomponent.component';
import { MaincomponentComponent } from './maincomponent/maincomponent.component';
import { PromotioncomponentComponent } from './promotioncomponent/promotioncomponent.component';
import { TaskcomponentComponent } from './taskcomponent/taskcomponent.component';
import { TodoListComponent } from './todo-list/todo-list.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoComponent,
    StockComponent,
    LinkcomponentComponent,
    MaincomponentComponent,
    PromotioncomponentComponent,
    TaskcomponentComponent,
    TodoListComponent,
   
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
