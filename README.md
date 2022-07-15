# D&D 5e Bestiary, Spellbook and Combat Tracker (sligthly modified 5e, but you don't need to use all of the fields if you don't want to)

Swing app made on Java for dugeonmasters and maybe if you want to make your character and use it here since your gm can send you spellbook and you can reference spells more easly than by looking on the internet.

Application allows you to:
  - save and search through your custom beasts that you will want to use in your games.
  - make spells and save them to spellbook
  - use your beasts in buid in combat tracker which will read what you saved in beastiary or add an empty one and write what you need by hand
  - list your beasts and have easier access to their details sorting them or filtering them

Notes on what to watch for while using:
- Top fields in line with name are text fields, the rest are number fields, you can write text there, but It will create an error and won't save it and won't calculate stats well. Obviously the big text boxes for Attacks and Spells, Features and Traits and Languages an Profieciencies are also text.
- On Beast's spell book you have only breif information of spell, after you chose your spellcasting class the list in chosing box will fill by reading spellbook file which will save after you save spells in the Spellbook panel. You also can just make a blank spell and write what you want in given fields and it will still save (name, mana cost or other cost, and description like on real life character sheat, they're all texts so don't worry), but the detail button won't do anything since they're not linked with spell from spellbook. (After you save changes in other panel to see them in other panels you need to reed from fail since they all work on the same file)
- In Combat Tracker if you want to add multiple of same creature you should add one from the chosing list or the list panel and then use to copy button, if you will add the same creature using the lists then the button to sort by initiative won't see difrence between them and will rewrite their stats to the last added even tho you could write other stuff in their stats. Also it's good to open details before coping since the copied creatures won't have all the stats in details, so all of the stats will be shown to you in the subpannel if you want more details about this type of creature.
- In Spellbook if you want to add classes that have access to this new added spell you need to go to the details and on the bottom you have a list of classes aviable and you can add them via list and button. Then after you save changes you shouldn't click save since it will rewrite the changes you made in detail panel, to prevent that you should click read from file after saving changes in details panel (unless you made more spells then you should also save them by saving their details)
- Never save spells if you filter them, you will lose all of the spells that you filtered from, unless you make a copy of a file somewhere else so you can idk why split spellbook into more files? If you save them after sorting every new use of this file will be sorted as you saved them.
