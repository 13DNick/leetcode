package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import leetcode.easy.BestTimeToBuyAndSellStock;
import leetcode.easy.GuessNumberHigherOrLower;
import leetcode.medium.CoinChange;
import leetcode.medium.ContainerWithMostWater;
import leetcode.medium.FindMinimumInRotatedSortedArray;
import leetcode.medium.LongestSubstringWithoutRepeatingCharacters;
import leetcode.medium.MaxProductSubArray;
import leetcode.medium.MaximumSubArray;
import leetcode.medium.MinimumPenaltyForAShop;
import leetcode.medium.PermutationInAString;
import leetcode.medium.RotateArray;
import leetcode.medium.TwoSumSorted;
import leetcode.medium.WordBreak;

public class Runner {

	@Test
	public void stock1() {
		int[] prices = {2,1,2,1,0,1,2};
		int expected = 2;
		BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
		
		
		assertEquals(expected, stock.maxProfitOn(prices));
	}

	@Test
	public void stock2() {
		int[] prices = {3,2,6,5,0,3};
		int expected = 4;
		BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
		
		
		assertEquals(expected, stock.maxProfitOn(prices));
	}
	
	@Test
	public void longestSubstringNoRepeatingChars() {
		String s = "au";
		int expected = 2;
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		
		assertEquals(expected, l.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void longestSubstringNoRepeatingChars2() {
		String s = "dvdf";
		int expected = 3;
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		
		assertEquals(expected, l.lengthOfLongestSubstring(s));
	}
	
	@Test
	public void maximumSubArray() {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int expected = 6;
		MaximumSubArray max = new MaximumSubArray();
		
		assertEquals(expected, max.maxSubArray(nums));
	}
	
	@Test
	public void maximumProductSubArray() {
		int[] nums = {-2,1,-3,4,1,2,1,-5,4};
		int expected = 480;
		MaxProductSubArray max = new MaxProductSubArray();
		
		assertEquals(expected, max.maxProduct(nums));
	}
	
	@Test
	public void GuessNumber() {
		GuessNumberHigherOrLower guess = new GuessNumberHigherOrLower(1702766719);
		
		int expected = 1702766719;
		
		assertEquals(expected, guess.guessNumber(2126753390));
	}
	
	@Test
	public void FindMinInRotatedArray() {
		FindMinimumInRotatedSortedArray min = new FindMinimumInRotatedSortedArray();
		int[] nums = {3, 4, 5, 1, 2,};
		int expected = 1;
		
		assertEquals(expected, min.findMin(nums));
	}
	
	@Test
	public void FindMinInRotatedArray2() {
		FindMinimumInRotatedSortedArray min = new FindMinimumInRotatedSortedArray();
		int[] nums = {5, 1, 2, 3, 4};
		int expected = 1;
		
		assertEquals(expected, min.findMin(nums));
	}
	
	@Test
	public void ContainerWithMostWater() {
		ContainerWithMostWater maxWater = new ContainerWithMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		int expected = 49;
		
		assertEquals(expected, maxWater.maxArea(height));
	}
	
	@Test
	public void ContainerWithMostWater2() {
		ContainerWithMostWater maxWater = new ContainerWithMostWater();
		int[] height = {2,3,4,5,18,17,6};
		int expected = 17;
		
		assertEquals(expected, maxWater.maxArea(height));
	}
	
	@Test
	public void coinChange() {
		CoinChange coin = new CoinChange();
		int[] coins = {1,2,5};
		int expected = 3;
		
		assertEquals(expected, coin.coinChange(coins, 11));		
	}
	
	@Test
	public void wordBreak() {
		WordBreak wb = new WordBreak();
		String s = "ab";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("a"); wordDict.add("b");
		
		assertEquals(true, wb.wordBreak(s, wordDict));
	}
	
	@Test
	public void wordBreak2() {
		WordBreak wb = new WordBreak();
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet"); wordDict.add("code");
		
		assertEquals(true, wb.wordBreak(s, wordDict));
	}
	
	@Test
	public void wordBreak3() {
		WordBreak wb = new WordBreak();
		String s = "applepenapple";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("apple"); wordDict.add("pen");
		
		assertEquals(true, wb.wordBreak(s, wordDict));
	}
	
	@Test
	public void wordBreak4() {
		WordBreak wb = new WordBreak();
		String s = "catsandog";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("cats"); wordDict.add("dog");wordDict.add("sand");
		wordDict.add("cat");wordDict.add("and");
		
		assertEquals(false, wb.wordBreak(s, wordDict));
	}
	
	@Test
	public void wordBreak5() {
		WordBreak wb = new WordBreak();
		String s = "bb";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("a"); wordDict.add("b");
		wordDict.add("bbb");wordDict.add("bbbb");
		
		assertEquals(true, wb.wordBreak(s, wordDict));
	}
	
	@Test
	public void RotateArray() {
		RotateArray ra = new RotateArray();
		
		int k = 1;
		int[] nums = {1,2,3};
		ra.rotate(nums, k);
		int[] expected = {3,1,2};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(nums));
	}
	
	@Test
	public void TwoSumSorted() {
		TwoSumSorted ts = new TwoSumSorted();
		
		int target = 9;
		int[] nums = {2,7,11,15};
		int[] expected = {1,2};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(ts.twoSum(nums, target)));
	}
	
	@Test
	public void MinPenalty() {
		MinimumPenaltyForAShop m = new MinimumPenaltyForAShop();
		
		String input = "YYNY";
		int expected = 2;
		
		assertEquals(expected, m.bestClosingTime(input));
	}
	
	@Test
	public void PermutationInAString() {
		PermutationInAString p = new PermutationInAString();
		
		boolean expected = true;
		
		assertEquals(expected, p.checkInclusion("abcdxabcde", "abcdeabcdx"));
	}
	
	@Test
	public void PermutationInAString2() {
		PermutationInAString p = new PermutationInAString();
		
		
		String s1 = "paoolrbebsqumnolusfdaavvkdmyulelajnilqxsujdycieizlwvuwcnwfemijpyixbjamphkufjfvfvjvdjbdkthlxrtyahuifdjqlvpvccajaosgffminewnhyzymgvwbsgirfwnjszjswffrolsuupwkiwjjtbcgqbyarskbyxdigcusygjpvdcubzmmpfzzwhuwibivbxjklpptfryfbamafxuzpzagivenlctomtcymlmkbzozyncdwvabqjvvzuwivzfjcqhrixwinyxqsnckkhjmfsomdkujzecihamydgkyntwztemhawvxpahtiwrjwysrzmrhwxkbazynwmgtyclyjqsrfkddjdmvxhtwnvxrlxfxnpyevsafmqmbvbnueqxegkcuwzwdmqqpdlegyrjhgytgfxtzagazguoadzycnwwhdlkogbzrwiwjxxvlpvxfbtrxtqahcfrbzixqyftlddwmwtorfvjzenksaukrevkddgnafwqtgsizisktrrmqvkeagjngtngqiithdxxefqpcdwmglvvjerwcwitdzlsozczimmbwxwvpccjyemhyyekruqejgrnhpfnxiodwmworpenustqtaswegjordqwqmdsmgbpxytptvnwtjmxwhfsnszscafeiyyuikthfnzcoassldzlkdgclyezsquhksisjvmcsxlwdpplwrwxthuipsjjfhtfqhcrnfcomnkbthyvhaelbtsyhrmjharxzhymxxbcwtxansrcwqsgzzdxzcqbphtccnjhikhhovezgbkgcwkavkrbydyctgizqferucmghsihyxgbpmehtwpwcwunitcrgdmcnodipruqegudtkluswpnvbdqyukspwvgchexiaxuebqfvitnmukebchkzmtnwcuymbnmyqgmzefnelwqnhleaadekwjehlkydpuwybendymsluptckrvbglxmamohiyszwkslittmdbfmxkmqomxfuskubytbgfvnlebmzxcsreqnjuctcjriszjpojywsitudelqljtufsbxmnykadnryjz";
String s2 = "pwjurfxfwxotemsiyitndgrtvzksgniyqolgwfhofhmnwmxbmphratrwdskjwutemrzivnndkxfmzzpenueyiztqcydbeftbuobqwyazibaettbqbueeaiayutaoqvmckemxhrecvptegifgemdsjkepzsedvkfixtvikviadomqsrwowftrnqdumlabwtbfsxkoytkgznmkfzbtntumlbjhxeaoxbuoshxsjnosnsrtzrtcqdifbiyvmrbwteajksskklrpkmbylwwprapfdhujoigcrqhtgtwolwjmoudnzlnmpnchwslpibwvffbcbbefpvfygnpluzyjrqipupidoxtgglbvnxmtzjaglglpkryudoskkyspuxmxrkmcxkueluiuvxsdwkorxgjikyoniicljvddfgfuhujplkakjnvskuozvmmavmyzdgzbohjrnfvsslyarxscfxscijsyhcqxnceqfavyzofvysilqdnpjypgtpjatklrnzhkygyfoaupibuqtuxbfsfcawiiulgohigutukhywypthyymvcabnsdsjtrdrtmifarhrcimzrpcbdfjtpwqsndlpiuletacqcccpnziupvclsinkdffnojfrvgypdajujzkdixugrbhqmwyjztfvvokmgdrbfmrdprmzoslldcssvkofxqsdrwapobietvmoonfipeejlgtuvpcbcfnsmupwjsgliheexediefcfrglliqoxjjsdjtpehqmkxkvkkflhwbvohryjpfgebcvkjqtcetxzhtfysomusfzsztqweekxbdcruwjgpdrwokseyaqznhihjulevycglkuacfgzlargjoquxoupfrhdegpqzrshmbierjjvzsdwsibinlrslimfgrsaacxijthbzmxnyuslffnfxziudxcdwfwnkmdeucbyydkhqkestxzvdraxjjcuzdgayabmxsltqdnsikxaasugkcovnvwfxiuozaphegpkhtmtqxxmwhrtblrtxvrtidkcluorcrksklgmismylsrwwtlhlnqnqlfmmefzltunpqozqpnxhtqvpovckbiaaejtwejjuuzmtargntaqehigzibxfczkwcthqijyhcdtupeqbtnnorrgmktlsgjortvsgjhrgzccgvlfjeqjfywufbqwnerpzxlnczxwjttiiokqfigqhgqaatzwynivuhpukuzgsijrfpganfroohnruzlijwinapnemwsxveqfremhwqwqwhxlmvfsnuglnkkqynvflxgdqayxpklerojawlidelttqlfvfmjoiwhylwrillyjjoxrfkayddfeytomjphsgzzbgxhbgdwonzrqrcbnrztgvoodyxrzbinqgeaptvyfkdizuzbxdiulvfqlsllkxkvmprritvhkdoghouifwpprblaeauyxyhlipccqjnorphmrelbsashkmmhnperidnmmizijbtfqkhgboniuphozbdgmlfieqjjpywvqggmsliocmvdkhxszrvqyjoxdvspqlljtbztjybmpwebavgmldxxohjfrmxpljszfjploblpsenjxqxdvmmwljoxmagpgxunlnoibvupfluyclemsywizdmrzchiujcqnlmcjkutxbzeibruvvknviojcflxfhyjhjkwerwgfowucgtyrimxiehdgwrifbpdaaqffgzssxiemrcyxpezijuyptdynatoivsqbkqbgutgmikqywkhcwhknunsnfsdkkhwwxvttohjwydlzihsjtwbzbtbemhssndaubxegtvinucugvvascicyfgqnhsidgcrrctjwrjjqbgcsfioebytsmalmnnnpznxcjlyvfykwsqbewxfgiazugkqdoggrjukpplsnaovwsliyiojnyhmiloyjkkwtrdcsyjxllfhvizydwlqlojidvzjylhzfvksneyduudibadamaoifenrvdduvljircjtlnohxxckjnfeiaagyqxyoyezloucybulpjrlhdwkdkagbukvjrkxjddpsahymtcfaivfaeioyynxykdacbloejpnnhtcxepzzuhzrnjrmpwvngrivioukkolckoskxjmjyzaqysaqbjevvqibbimxhehlkuyknwqkhfabgdnuwgzofmyetruzxszdcypmqouxyqyuvfvijircklyfifwbypgwbwvwrvxxmoyzdlpecfsbinlthrdnckqagstfgyzhduluvscnmmwzapxaraxcvkndddlfrcnzpkyhksxerhgaulwetciqaefwmmzdsqfldtouxlqqgrqsvksyrnspqmkiewwhrjkoahzpacgylikhnoswnsyzuvxzdrlxgcfflogzezkofstastmpvftshxvizunhsuakqqjscycfrqejprsogqzlkuskvnbgbjisbasgdjlmgpiklkhbfoaqjfrjmmtzfggyrsyymtfkuuqtrbvtnnzcaiuqjlgosortmyjqqzmadqgjijrofedppddtfdyijinvxehpbanizoqtowugvzflscmcfqelycotzwpwhxzmdsaxrwhgvlaookontbwunqfiuxarlztainztyooiuazebwmukvgcpvnkllkjoazejdmocpeuurhfarzjdybgxusmocaiaqxicgdorwdrvrrmjczfajbbmjnmvohjfsprufofokpaoolrbebsqumnolusfdaavvkdmyelelajniwqxsujdycieizlwviwcnwfcmijpyixbjamphkufkmvfvjvdjbdkthlxrtyahuifdjqlvpvccajaosgffminewnhyzymgvwbsgirfwnjszjswffkolsuupwkiwjjtbcgqbyarskbyxdigcusygjpvdcubzmmpfzzwhuwibivbxjklpptfryfbamafxuzpzagivenlctomtcymlmkbzozyncdwvabqjvvbuwivzfjcqhrixwinyxqsnckkhimfsomdkujtecihamydgkyntwztemhawvxpahtiwrjwysrzmrhwxkfazynwmgtyclyjqsrfkddjdmvxhzwnvxrlxfxnpyevsafmqmbvbnueqxegkcuwzidmqqpdlegyrjhgytgfxtzagazguoydzycnwwhdlkogbzrwiwjxxvlgvxfbtrxtqahcfrbzixqyftlddwmwtorfvjzenksaukrevkddgnafwqtgswzisktrrmqvkeagjngtnjqiithdxxefqpcdwmglvvjerwcwitdzlsozczimmbwxwvpccjyemhyyekruqejgrnhpfnxjodwmworpenustqoaswegjordqlqmdsmgbpxytptvnwtjmxwhfsnszscafeiyyuikthfnzcoassldzlkdgclyezsquhksisjvmcsxlwdpplwrwxthuupsjjfhtfqhcrnfcomnkbthyvhaelbtsyhrhjharxzhymxxbcwtxansrcwqsgzzdxzcqbpmtccnjhikhhovezgbkgcwkavkrbydyctgizqferucmghsihyxgbpmehtwpwewunitcrgdmcnodipruqegudtkluswpnvbdqyukspwvgchexiakuebqfvitnmukebchkzmtnwcuymbnmyqgfzefnelwqnhleaadekwjehljydpuwybendymsluptckrvbplxmamohiyszwrslittmdbfmxkmqtmxfusxubatbgfvnlebmzxcsruqnjuctcjriszjpogywsitudelqljtubszxmnykadnryjzhosyorgzvpzolmpbafnvcrrzfaxoqaulbcbnrucuydqbppnpgrdoyugbpiqdafccgordlqbwcgzirbbpaftoqtujqrljdqjrtwaqskcfqjqhvlgzbdmarajevjjrphkdzturmpqomzcewxxrpglsjehpfhmwmgeotxbswzswftewfchvxpqjyzlwwkxmssxpmdrtclakalcsgpwkvntjshydpvjauqilqkeyjojgehwwlattlhlgdgpotxhlrmffspdyxmjfonkzwdjkambqnwicehfzjvrxwsrbkztmtermdjjlaxlremdxnnfavmtclhvhesujoasmqonrjzlznywprupsfdafmuhunpigohenjnmpwdxcolvwuyptjigbihzcotxqjgskupqeomwlosbxqdjxwhmifbxzptjmvnfbpswtbjlmijpprzfelgzxbigrijgxlvmurzdvhxskpczyqrdelsyuqmfdxhzodxlhtsfxapwreaqtmzdhkibnwvsfsdolvwzwwjmgysrqfihakhhbbpfhbtvknsenzyvwyzudvvwgxjavcjyweomjfkucztlevmbbxqwznytbhdaowmecfkcfmiyvcfundeflybuifpvkvezezadmauwjzyfmdkxdvsfqkdkwydqhmmxfblfhnzqanonlmj";
		boolean expected = true;
		
		assertEquals(expected, p.checkInclusion(s1, s2));
	}
	
	/*@Test
	public void DifferenceBetweenOnesAndZeros() {
		DifferenceBetweenOnesAndZeros d = new DifferenceBetweenOnesAndZeros();
		
		int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
		int[][] expected = {{0,0,4},{0,0,4},{-2,-2,2}};
		int[][] result = d.onesMinusZeros(grid);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		
		assertEquals(expected, result);
	}
	
	@Test
	public void DifferenceBetweenOnesAndZeros2() {
		DifferenceBetweenOnesAndZeros d = new DifferenceBetweenOnesAndZeros();
		
		int[][] grid = {{1,1,1},{1,1,1}};
		int[][] expected = {{5,5,5},{5,5,5}};
		int[][] result = d.onesMinusZeros(grid);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		
		//assertEquals(expected, result);
	}
	*/
}
