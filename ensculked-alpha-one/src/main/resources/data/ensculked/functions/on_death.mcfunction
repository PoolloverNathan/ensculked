gamemode spectator
particle block sculk ~ ~0.5 ~ 0.3 0.5 0.3 0.1 10 normal
playsound entity.zombie.break_wooden_door player @a[distance=..30] ~ ~ ~ 1 1 1
advancement grant @s only ensculked:ensculkment/death_prevented
resource set @s ensculked:souls 1