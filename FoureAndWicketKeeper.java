package TestVagrant;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class FoureAndWicketKeeper {
	@Test
	public void FourPlayers() {

		String url = "https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765";
		String Response = "https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765/raw/184cef7125e6ef5a774e60de31479bb9b2884cb5/TeamRCB.json";
		RestAssured.baseURI = url;
		String resources = given().when().get(Response).then().extract().asString();
		JsonPath Js = new JsonPath(resources);
		String PlayerOne = Js.getString("player[0].name");
		System.out.println(PlayerOne);
        String PlayerTwo = Js.getString("player[2].name");
		System.out.println(PlayerTwo);
		String PlayerThree = Js.getString("player[9].name");
		System.out.println(PlayerThree);
        String PlayerFour = Js.getString("player[10].name");
		System.out.println(PlayerFour);
	}

	@Test
	public void Wicketkeeper() {
		String url = "https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765";
		String Response = "https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765/raw/184cef7125e6ef5a774e60de31479bb9b2884cb5/TeamRCB.json";
		RestAssured.baseURI = url;
		String resources = given().when().get(Response).then().extract().asString();
		JsonPath Js = new JsonPath(resources);
		String WeecketKeeper = Js.getString("player[6].name");
		System.out.println(WeecketKeeper);

	}
}
