package controllers

import play.api.mvc._


class RecipeController extends Controller{
  
  def getAllRecipes = Action { request =>
    val availableTickets = 1000
    Ok(availableTickets.toString)
  }
  
}