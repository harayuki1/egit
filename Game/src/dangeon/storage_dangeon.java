package dangeon;
//データベースを活用予定　
//一時的なマップサンプル保存
public class storage_dangeon {
	private static Panel[][] sample = {
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			
			};//start 8,5 goal 0,8
	private static Panel[][] muradara_mid_in = {
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_updown"), new Panel_wall_1("wall_1_up"), new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown")  }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")   }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_3("wall_3_noright"), new Panel_Cross("wall_cross"), new Panel_wall_2("wall_2_updown"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") }, 
			{ new Panel_wall_2("wall_2_upleft"),new Panel_wall_1("wall_1_up"),new Panel_wall_1("wall_1_up"),new Panel_wall_2("wall_2_upright"),new Panel_wall_4("wall_4"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") ,new Panel_wall_4("wall_4")  }, 
			{ new Panel_wall_1("wall_1_left"),new Panel_Cross("wall_cross"),new Panel_Cross("wall_cross"),new Panel_Cross("wall_cross"),new Panel_wall_2("wall_2_updown"), new Panel_Cross("wall_cross"), new Panel_wall_3("wall_3_noleft"),new Panel_wall_4("wall_4") ,new Panel_wall_4("wall_4")  }, 
			{ new Panel_wall_2("wall_2_downleft"),new Panel_wall_1("wall_1_down"),new Panel_wall_1("wall_1_down"),new Panel_wall_2("wall_2_downright"),new Panel_wall_4("wall_4"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") ,new Panel_wall_4("wall_4")  }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") ,new Panel_wall_4("wall_4")  }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") ,new Panel_wall_4("wall_4")  }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_upleft"), new Panel_Cross("wall_cross"), new Panel_wall_2("wall_2_upright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"), new Panel_Cross("wall_cross"), new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") },
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"), new Panel_Cross("wall_cross"), new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") }, 
			{ new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_downleft"), new Panel_wall_1("wall_1_down"), new Panel_wall_2("wall_2_downright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4") } 
			};//start 8,5 goal 0,8
	
	private static Panel[][] muradara_mid_out = {
			{new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_upleft"),new Panel_wall_2("wall_2_upright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_1("wall_1__right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_Cross("wall_cross"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_3("wall_3_noleft")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_4("wall_cross"),new Panel_wall_2("wall_2_upright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_Cross("wall_cross"),new Panel_Cross("wall_cross"),new Panel_wall_3("wall_3_noleft"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_Cross("wall_cross"),new Panel_wall_2("wall_2_downright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_1("wall_1_left"),new Panel_wall_1("wall_1_right"),new Panel_wall_4("wall_4"),new Panel_wall_3("wall_3_nodown"),new Panel_wall_4("wall_4")},
			{new Panel_wall_3("wall_3_nodown"),new Panel_wall_2("wall_2_downleft"),new Panel_Cross("wall_cross"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4")},
			{new Panel_wall_2("wall_2_downleft"),new Panel_wall_2("wall_2_updown"),new Panel_Cross("wall_cross"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_downright"),new Panel_wall_4("wall_4")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_3("wall_3_noright"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_downright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			
			};//start 10,0 goal 4,5
	private static Panel[][] test = {
			{new Panel_wall_3("wall_3_nodown"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_2("wall_2_downleft"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_upright")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright")},
			{new Panel_wall_2("wall_2_upleft"),new Panel_wall_2("wall_2_updown"),new Panel_Cross("wall_Cross"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_upright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright")},
			{new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright")},
			{new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_3("wall_3_noright"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_downright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright")},
			{new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright")},
			{new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_upleft"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_downright")},
			{new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_leftright"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4")},
			{new Panel_wall_3("wall_3_noup"),new Panel_wall_4("wall_4"),new Panel_wall_2("wall_2_downleft"),new Panel_wall_2("wall_2_updown"),new Panel_Cross("wall_Cross"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_updown"),new Panel_wall_2("wall_2_upright")},
			{new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_4("wall_4"),new Panel_wall_3("wall_3_noup"),new Panel_wall_2("wall_2_leftright")},
			
			
			};//start 10,8 goal 0,0
}
